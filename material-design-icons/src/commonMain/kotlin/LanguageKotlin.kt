package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.LanguageKotlin: ImageVector
    get() {
        if (_LanguageKotlin != null) {
            return _LanguageKotlin!!
        }
        _LanguageKotlin = ImageVector.Builder(
            name = "LanguageKotlin",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 2f)
                horizontalLineTo(22f)
                lineTo(12f, 12f)
                lineTo(22f, 22f)
                horizontalLineTo(2f)
                close()
            }
        }.build()

        return _LanguageKotlin!!
    }

@Suppress("ObjectPropertyName")
private var _LanguageKotlin: ImageVector? = null
