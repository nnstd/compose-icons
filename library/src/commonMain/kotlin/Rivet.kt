package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Rivet: ImageVector
    get() {
        if (_Rivet != null) {
            return _Rivet!!
        }
        _Rivet = ImageVector.Builder(
            name = "Rivet",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.43f, 2f)
                curveTo(10.61f, 2f, 9.94f, 2.65f, 9.94f, 3.5f)
                curveTo(9.94f, 4.64f, 9.94f, 5.8f, 9.94f, 6.96f)
                horizontalLineTo(7.95f)
                verticalLineTo(7.95f)
                horizontalLineTo(15.91f)
                verticalLineTo(6.96f)
                horizontalLineTo(13.92f)
                curveTo(13.92f, 5.8f, 13.92f, 4.64f, 13.92f, 3.5f)
                curveTo(13.92f, 2.65f, 13.25f, 2f, 12.43f, 2f)
                horizontalLineTo(11.43f)
                moveTo(10.94f, 8.95f)
                verticalLineTo(21.87f)
                lineTo(11.93f, 22.87f)
                lineTo(12.92f, 21.87f)
                verticalLineTo(8.95f)
                horizontalLineTo(10.94f)
                close()
            }
        }.build()

        return _Rivet!!
    }

@Suppress("ObjectPropertyName")
private var _Rivet: ImageVector? = null
