package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PipeWrench: ImageVector
    get() {
        if (_PipeWrench != null) {
            return _PipeWrench!!
        }
        _PipeWrench = ImageVector.Builder(
            name = "PipeWrench",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.17f, 5.63f)
                lineTo(14.06f, 7.78f)
                lineTo(11.91f, 5.63f)
                lineTo(16.17f, 1.41f)
                lineTo(19.69f, 4.92f)
                curveTo(20.86f, 6.09f, 20.86f, 8f, 19.69f, 9.19f)
                lineTo(16.17f, 5.63f)
                moveTo(4.83f, 12.7f)
                lineTo(7f, 14.81f)
                lineTo(10.5f, 11.3f)
                lineTo(8.39f, 9.19f)
                lineTo(4.83f, 12.7f)
                moveTo(15.47f, 7.78f)
                lineTo(19f, 11.3f)
                lineTo(17.58f, 12.7f)
                lineTo(16.88f, 12f)
                lineTo(6.23f, 22.59f)
                lineTo(3.42f, 19.78f)
                lineTo(11.91f, 11.3f)
                lineTo(7.69f, 7.03f)
                lineTo(9.8f, 4.92f)
                lineTo(14.06f, 9.19f)
                lineTo(15.47f, 7.78f)
                close()
            }
        }.build()

        return _PipeWrench!!
    }

@Suppress("ObjectPropertyName")
private var _PipeWrench: ImageVector? = null
