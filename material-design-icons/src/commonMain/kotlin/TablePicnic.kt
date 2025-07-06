package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TablePicnic: ImageVector
    get() {
        if (_TablePicnic != null) {
            return _TablePicnic!!
        }
        _TablePicnic = ImageVector.Builder(
            name = "TablePicnic",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 6f)
                horizontalLineTo(20f)
                verticalLineTo(9f)
                horizontalLineTo(18f)
                lineTo(18.22f, 11f)
                horizontalLineTo(23f)
                verticalLineTo(13f)
                horizontalLineTo(18.44f)
                lineTo(19f, 18f)
                horizontalLineTo(16.5f)
                lineTo(15.94f, 13f)
                horizontalLineTo(8.06f)
                lineTo(7.5f, 18f)
                horizontalLineTo(5f)
                lineTo(5.56f, 13f)
                horizontalLineTo(1f)
                verticalLineTo(11f)
                horizontalLineTo(5.78f)
                lineTo(6f, 9f)
                horizontalLineTo(4f)
                moveTo(15.5f, 9f)
                horizontalLineTo(8.5f)
                lineTo(8.29f, 11f)
                horizontalLineTo(15.71f)
                close()
            }
        }.build()

        return _TablePicnic!!
    }

@Suppress("ObjectPropertyName")
private var _TablePicnic: ImageVector? = null
