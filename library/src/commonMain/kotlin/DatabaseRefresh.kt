package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.DatabaseRefresh: ImageVector
    get() {
        if (_DatabaseRefresh != null) {
            return _DatabaseRefresh!!
        }
        _DatabaseRefresh = ImageVector.Builder(
            name = "DatabaseRefresh",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 3f)
                curveTo(16.42f, 3f, 20f, 4.79f, 20f, 7f)
                curveTo(20f, 9.21f, 16.42f, 11f, 12f, 11f)
                curveTo(7.58f, 11f, 4f, 9.21f, 4f, 7f)
                curveTo(4f, 4.79f, 7.58f, 3f, 12f, 3f)
                moveTo(4f, 9f)
                curveTo(4f, 11.21f, 7.58f, 13f, 12f, 13f)
                curveTo(13.11f, 13f, 14.18f, 12.89f, 15.14f, 12.68f)
                curveTo(14.19f, 13.54f, 13.5f, 14.67f, 13.18f, 15.96f)
                lineTo(12f, 16f)
                curveTo(7.58f, 16f, 4f, 14.21f, 4f, 12f)
                verticalLineTo(9f)
                moveTo(20f, 9f)
                verticalLineTo(11f)
                lineTo(19.5f, 11f)
                lineTo(18.9f, 11.03f)
                curveTo(19.6f, 10.43f, 20f, 9.74f, 20f, 9f)
                moveTo(4f, 14f)
                curveTo(4f, 16.21f, 7.58f, 18f, 12f, 18f)
                lineTo(13f, 17.97f)
                curveTo(13.09f, 19.03f, 13.42f, 20f, 13.95f, 20.88f)
                lineTo(12f, 21f)
                curveTo(7.58f, 21f, 4f, 19.21f, 4f, 17f)
                verticalLineTo(14f)
                moveTo(19f, 13.5f)
                curveTo(20.11f, 13.5f, 21.11f, 13.95f, 21.83f, 14.67f)
                lineTo(23f, 13.5f)
                verticalLineTo(17.5f)
                horizontalLineTo(19f)
                lineTo(20.77f, 15.73f)
                curveTo(20.32f, 15.28f, 19.69f, 15f, 19f, 15f)
                curveTo(17.62f, 15f, 16.5f, 16.12f, 16.5f, 17.5f)
                curveTo(16.5f, 18.88f, 17.62f, 20f, 19f, 20f)
                curveTo(19.82f, 20f, 20.54f, 19.61f, 21f, 19f)
                horizontalLineTo(22.71f)
                curveTo(22.12f, 20.47f, 20.68f, 21.5f, 19f, 21.5f)
                curveTo(16.79f, 21.5f, 15f, 19.71f, 15f, 17.5f)
                curveTo(15f, 15.29f, 16.79f, 13.5f, 19f, 13.5f)
                close()
            }
        }.build()

        return _DatabaseRefresh!!
    }

@Suppress("ObjectPropertyName")
private var _DatabaseRefresh: ImageVector? = null
