package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.EqualizerOutline: ImageVector
    get() {
        if (_EqualizerOutline != null) {
            return _EqualizerOutline!!
        }
        _EqualizerOutline = ImageVector.Builder(
            name = "EqualizerOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 21f)
                horizontalLineTo(9f)
                verticalLineTo(3f)
                horizontalLineTo(15f)
                verticalLineTo(21f)
                moveTo(11f, 19f)
                horizontalLineTo(13f)
                verticalLineTo(5f)
                horizontalLineTo(11f)
                verticalLineTo(19f)
                moveTo(8f, 21f)
                horizontalLineTo(2f)
                verticalLineTo(11f)
                horizontalLineTo(8f)
                verticalLineTo(21f)
                moveTo(4f, 19f)
                horizontalLineTo(6f)
                verticalLineTo(13f)
                horizontalLineTo(4f)
                verticalLineTo(19f)
                moveTo(22f, 21f)
                horizontalLineTo(16f)
                verticalLineTo(8f)
                horizontalLineTo(22f)
                verticalLineTo(21f)
                moveTo(18f, 19f)
                horizontalLineTo(20f)
                verticalLineTo(10f)
                horizontalLineTo(18f)
                verticalLineTo(19f)
                close()
            }
        }.build()

        return _EqualizerOutline!!
    }

@Suppress("ObjectPropertyName")
private var _EqualizerOutline: ImageVector? = null
