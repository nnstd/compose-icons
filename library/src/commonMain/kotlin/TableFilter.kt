package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TableFilter: ImageVector
    get() {
        if (_TableFilter != null) {
            return _TableFilter!!
        }
        _TableFilter = ImageVector.Builder(
            name = "TableFilter",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 21f)
                lineTo(18.8f, 22.77f)
                curveTo(19.3f, 23.27f, 20f, 22.87f, 20f, 22.28f)
                verticalLineTo(18f)
                lineTo(22.8f, 14.6f)
                curveTo(23.3f, 13.9f, 22.8f, 13f, 22f, 13f)
                horizontalLineTo(15f)
                curveTo(14.2f, 13f, 13.7f, 14f, 14.2f, 14.6f)
                lineTo(17f, 18f)
                verticalLineTo(21f)
                moveTo(12f, 11f)
                horizontalLineTo(20f)
                verticalLineTo(3f)
                curveTo(20f, 1.9f, 19.11f, 1f, 18f, 1f)
                horizontalLineTo(4f)
                curveTo(2.9f, 1f, 2f, 1.9f, 2f, 3f)
                verticalLineTo(15f)
                curveTo(2f, 16.11f, 2.9f, 17f, 4f, 17f)
                horizontalLineTo(13.42f)
                lineTo(12f, 15f)
                verticalLineTo(11f)
                moveTo(12f, 5f)
                horizontalLineTo(18f)
                verticalLineTo(9f)
                horizontalLineTo(12f)
                verticalLineTo(5f)
                moveTo(10f, 15f)
                horizontalLineTo(4f)
                verticalLineTo(11f)
                horizontalLineTo(10f)
                verticalLineTo(15f)
                moveTo(10f, 9f)
                horizontalLineTo(4f)
                verticalLineTo(5f)
                horizontalLineTo(10f)
                verticalLineTo(9f)
                close()
            }
        }.build()

        return _TableFilter!!
    }

@Suppress("ObjectPropertyName")
private var _TableFilter: ImageVector? = null
