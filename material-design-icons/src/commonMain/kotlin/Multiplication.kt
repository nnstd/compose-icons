package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Multiplication: ImageVector
    get() {
        if (_Multiplication != null) {
            return _Multiplication!!
        }
        _Multiplication = ImageVector.Builder(
            name = "Multiplication",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 3f)
                horizontalLineTo(13f)
                verticalLineTo(10.27f)
                lineTo(19.29f, 6.64f)
                lineTo(20.29f, 8.37f)
                lineTo(14f, 12f)
                lineTo(20.3f, 15.64f)
                lineTo(19.3f, 17.37f)
                lineTo(13f, 13.72f)
                verticalLineTo(21f)
                horizontalLineTo(11f)
                verticalLineTo(13.73f)
                lineTo(4.69f, 17.36f)
                lineTo(3.69f, 15.63f)
                lineTo(10f, 12f)
                lineTo(3.72f, 8.36f)
                lineTo(4.72f, 6.63f)
                lineTo(11f, 10.26f)
                verticalLineTo(3f)
                close()
            }
        }.build()

        return _Multiplication!!
    }

@Suppress("ObjectPropertyName")
private var _Multiplication: ImageVector? = null
