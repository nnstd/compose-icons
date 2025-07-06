package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MirrorVariant: ImageVector
    get() {
        if (_MirrorVariant != null) {
            return _MirrorVariant!!
        }
        _MirrorVariant = ImageVector.Builder(
            name = "MirrorVariant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.29f, 10.28f)
                lineTo(11.53f, 7.03f)
                lineTo(12.59f, 8.09f)
                lineTo(9.35f, 11.34f)
                lineTo(8.29f, 10.28f)
                moveTo(8.7f, 14.61f)
                lineTo(14.36f, 8.95f)
                lineTo(15.42f, 10f)
                lineTo(9.76f, 15.67f)
                lineTo(8.7f, 14.61f)
                moveTo(14.17f, 3f)
                lineTo(18f, 6.83f)
                verticalLineTo(17.17f)
                lineTo(14.17f, 21f)
                horizontalLineTo(9.83f)
                lineTo(6f, 17.17f)
                verticalLineTo(6.83f)
                lineTo(9.83f, 3f)
                horizontalLineTo(14.17f)
                moveTo(15f, 1f)
                horizontalLineTo(9f)
                lineTo(4f, 6f)
                verticalLineTo(18f)
                lineTo(9f, 23f)
                horizontalLineTo(15f)
                lineTo(20f, 18f)
                verticalLineTo(6f)
                lineTo(15f, 1f)
                close()
            }
        }.build()

        return _MirrorVariant!!
    }

@Suppress("ObjectPropertyName")
private var _MirrorVariant: ImageVector? = null
