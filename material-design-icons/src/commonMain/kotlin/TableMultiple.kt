package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TableMultiple: ImageVector
    get() {
        if (_TableMultiple != null) {
            return _TableMultiple!!
        }
        _TableMultiple = ImageVector.Builder(
            name = "TableMultiple",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 2f)
                horizontalLineTo(21f)
                curveTo(22.11f, 2f, 23f, 2.9f, 23f, 4f)
                verticalLineTo(16f)
                curveTo(23f, 17.11f, 22.11f, 18f, 21f, 18f)
                horizontalLineTo(7f)
                curveTo(5.9f, 18f, 5f, 17.11f, 5f, 16f)
                verticalLineTo(4f)
                curveTo(5f, 2.9f, 5.9f, 2f, 7f, 2f)
                moveTo(7f, 6f)
                verticalLineTo(10f)
                horizontalLineTo(13f)
                verticalLineTo(6f)
                horizontalLineTo(7f)
                moveTo(15f, 6f)
                verticalLineTo(10f)
                horizontalLineTo(21f)
                verticalLineTo(6f)
                horizontalLineTo(15f)
                moveTo(7f, 12f)
                verticalLineTo(16f)
                horizontalLineTo(13f)
                verticalLineTo(12f)
                horizontalLineTo(7f)
                moveTo(15f, 12f)
                verticalLineTo(16f)
                horizontalLineTo(21f)
                verticalLineTo(12f)
                horizontalLineTo(15f)
                moveTo(3f, 20f)
                verticalLineTo(6f)
                horizontalLineTo(1f)
                verticalLineTo(20f)
                curveTo(1f, 21.11f, 1.89f, 22f, 3f, 22f)
                horizontalLineTo(19f)
                verticalLineTo(20f)
                horizontalLineTo(3f)
                close()
            }
        }.build()

        return _TableMultiple!!
    }

@Suppress("ObjectPropertyName")
private var _TableMultiple: ImageVector? = null
