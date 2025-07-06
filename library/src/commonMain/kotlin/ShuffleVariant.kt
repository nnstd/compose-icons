package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ShuffleVariant: ImageVector
    get() {
        if (_ShuffleVariant != null) {
            return _ShuffleVariant!!
        }
        _ShuffleVariant = ImageVector.Builder(
            name = "ShuffleVariant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 3f)
                lineTo(22.25f, 7.5f)
                lineTo(17f, 12f)
                lineTo(22.25f, 16.5f)
                lineTo(17f, 21f)
                verticalLineTo(18f)
                horizontalLineTo(14.26f)
                lineTo(11.44f, 15.18f)
                lineTo(13.56f, 13.06f)
                lineTo(15.5f, 15f)
                horizontalLineTo(17f)
                verticalLineTo(12f)
                lineTo(17f, 9f)
                horizontalLineTo(15.5f)
                lineTo(6.5f, 18f)
                horizontalLineTo(2f)
                verticalLineTo(15f)
                horizontalLineTo(5.26f)
                lineTo(14.26f, 6f)
                horizontalLineTo(17f)
                verticalLineTo(3f)
                moveTo(2f, 6f)
                horizontalLineTo(6.5f)
                lineTo(9.32f, 8.82f)
                lineTo(7.2f, 10.94f)
                lineTo(5.26f, 9f)
                horizontalLineTo(2f)
                verticalLineTo(6f)
                close()
            }
        }.build()

        return _ShuffleVariant!!
    }

@Suppress("ObjectPropertyName")
private var _ShuffleVariant: ImageVector? = null
