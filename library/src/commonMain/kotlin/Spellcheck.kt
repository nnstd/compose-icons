package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Spellcheck: ImageVector
    get() {
        if (_Spellcheck != null) {
            return _Spellcheck!!
        }
        _Spellcheck = ImageVector.Builder(
            name = "Spellcheck",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.59f, 11.59f)
                lineTo(13.5f, 19.68f)
                lineTo(9.83f, 16f)
                lineTo(8.42f, 17.41f)
                lineTo(13.5f, 22.5f)
                lineTo(23f, 13f)
                moveTo(6.43f, 11f)
                lineTo(8.5f, 5.5f)
                lineTo(10.57f, 11f)
                moveTo(12.45f, 16f)
                horizontalLineTo(14.54f)
                lineTo(9.43f, 3f)
                horizontalLineTo(7.57f)
                lineTo(2.46f, 16f)
                horizontalLineTo(4.55f)
                lineTo(5.67f, 13f)
                horizontalLineTo(11.31f)
                lineTo(12.45f, 16f)
                close()
            }
        }.build()

        return _Spellcheck!!
    }

@Suppress("ObjectPropertyName")
private var _Spellcheck: ImageVector? = null
