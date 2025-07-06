package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Axis: ImageVector
    get() {
        if (_Axis != null) {
            return _Axis!!
        }
        _Axis = ImageVector.Builder(
            name = "Axis",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2.61f, 21f)
                lineTo(1.61f, 19.27f)
                lineTo(11f, 13.85f)
                verticalLineTo(3f)
                horizontalLineTo(13f)
                verticalLineTo(13.85f)
                lineTo(22.39f, 19.27f)
                lineTo(21.39f, 21f)
                lineTo(12f, 15.58f)
                lineTo(2.61f, 21f)
                close()
            }
        }.build()

        return _Axis!!
    }

@Suppress("ObjectPropertyName")
private var _Axis: ImageVector? = null
