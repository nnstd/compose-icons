package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Manjaro: ImageVector
    get() {
        if (_Manjaro != null) {
            return _Manjaro!!
        }
        _Manjaro = ImageVector.Builder(
            name = "Manjaro",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 2f)
                verticalLineTo(22f)
                horizontalLineTo(7.6f)
                verticalLineTo(7.6f)
                horizontalLineTo(14.8f)
                verticalLineTo(2f)
                horizontalLineTo(2f)
                moveTo(9.2f, 9.2f)
                verticalLineTo(22f)
                horizontalLineTo(14.8f)
                verticalLineTo(9.2f)
                horizontalLineTo(9.2f)
                moveTo(16.4f, 2f)
                verticalLineTo(22f)
                horizontalLineTo(22f)
                verticalLineTo(2f)
                horizontalLineTo(16.4f)
                close()
            }
        }.build()

        return _Manjaro!!
    }

@Suppress("ObjectPropertyName")
private var _Manjaro: ImageVector? = null
