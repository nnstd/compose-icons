package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.LanguageHaskell: ImageVector
    get() {
        if (_LanguageHaskell != null) {
            return _LanguageHaskell!!
        }
        _LanguageHaskell = ImageVector.Builder(
            name = "LanguageHaskell",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2.08f, 19f)
                lineTo(6.75f, 12f)
                lineTo(2.08f, 5f)
                horizontalLineTo(5.58f)
                lineTo(10.25f, 12f)
                lineTo(5.58f, 19f)
                horizontalLineTo(2.08f)
                moveTo(6.75f, 19f)
                lineTo(11.42f, 12f)
                lineTo(6.75f, 5f)
                horizontalLineTo(10.25f)
                lineTo(19.59f, 19f)
                horizontalLineTo(16.09f)
                lineTo(13.17f, 14.63f)
                lineTo(10.25f, 19f)
                horizontalLineTo(6.75f)
                moveTo(18.03f, 14.92f)
                lineTo(16.5f, 12.58f)
                horizontalLineTo(21.92f)
                verticalLineTo(14.92f)
                horizontalLineTo(18.03f)
                moveTo(15.7f, 11.42f)
                lineTo(14.14f, 9.08f)
                horizontalLineTo(21.92f)
                verticalLineTo(11.42f)
                horizontalLineTo(15.7f)
                close()
            }
        }.build()

        return _LanguageHaskell!!
    }

@Suppress("ObjectPropertyName")
private var _LanguageHaskell: ImageVector? = null
