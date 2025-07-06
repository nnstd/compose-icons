package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TableRefresh: ImageVector
    get() {
        if (_TableRefresh != null) {
            return _TableRefresh!!
        }
        _TableRefresh = ImageVector.Builder(
            name = "TableRefresh",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 14.5f)
                curveTo(19.11f, 14.5f, 20.11f, 14.95f, 20.83f, 15.67f)
                lineTo(22f, 14.5f)
                verticalLineTo(18.5f)
                horizontalLineTo(18f)
                lineTo(19.77f, 16.73f)
                curveTo(19.32f, 16.28f, 18.69f, 16f, 18f, 16f)
                curveTo(16.62f, 16f, 15.5f, 17.12f, 15.5f, 18.5f)
                curveTo(15.5f, 19.88f, 16.62f, 21f, 18f, 21f)
                curveTo(18.82f, 21f, 19.55f, 20.61f, 20f, 20f)
                horizontalLineTo(21.71f)
                curveTo(21.12f, 21.47f, 19.68f, 22.5f, 18f, 22.5f)
                curveTo(15.79f, 22.5f, 14f, 20.71f, 14f, 18.5f)
                curveTo(14f, 16.29f, 15.79f, 14.5f, 18f, 14.5f)
                moveTo(4f, 3f)
                horizontalLineTo(18f)
                curveTo(19.11f, 3f, 20f, 3.9f, 20f, 5f)
                verticalLineTo(12.17f)
                curveTo(19.5f, 12.06f, 19f, 12f, 18.5f, 12f)
                curveTo(17.23f, 12f, 16.04f, 12.37f, 15.04f, 13f)
                horizontalLineTo(12f)
                verticalLineTo(17f)
                horizontalLineTo(12.18f)
                curveTo(12.06f, 17.5f, 12f, 18f, 12f, 18.5f)
                lineTo(12f, 19f)
                horizontalLineTo(4f)
                curveTo(2.9f, 19f, 2f, 18.11f, 2f, 17f)
                verticalLineTo(5f)
                curveTo(2f, 3.9f, 2.9f, 3f, 4f, 3f)
                moveTo(4f, 7f)
                verticalLineTo(11f)
                horizontalLineTo(10f)
                verticalLineTo(7f)
                horizontalLineTo(4f)
                moveTo(12f, 7f)
                verticalLineTo(11f)
                horizontalLineTo(18f)
                verticalLineTo(7f)
                horizontalLineTo(12f)
                moveTo(4f, 13f)
                verticalLineTo(17f)
                horizontalLineTo(10f)
                verticalLineTo(13f)
                horizontalLineTo(4f)
                close()
            }
        }.build()

        return _TableRefresh!!
    }

@Suppress("ObjectPropertyName")
private var _TableRefresh: ImageVector? = null
