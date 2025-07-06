package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Angularjs: ImageVector
    get() {
        if (_Angularjs != null) {
            return _Angularjs!!
        }
        _Angularjs = ImageVector.Builder(
            name = "Angularjs",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2.5f)
                lineTo(20.84f, 5.65f)
                lineTo(19.5f, 17.35f)
                lineTo(12f, 21.5f)
                lineTo(4.5f, 17.35f)
                lineTo(3.16f, 5.65f)
                lineTo(12f, 2.5f)
                moveTo(12f, 4.5f)
                lineTo(5f, 7f)
                lineTo(6.08f, 16.22f)
                lineTo(12f, 19.5f)
                lineTo(17.92f, 16.22f)
                lineTo(19f, 7f)
                lineTo(12f, 4.5f)
                moveTo(12f, 5.72f)
                lineTo(16.58f, 16f)
                horizontalLineTo(14.87f)
                lineTo(13.94f, 13.72f)
                horizontalLineTo(10.04f)
                lineTo(9.12f, 16f)
                horizontalLineTo(7.41f)
                lineTo(12f, 5.72f)
                moveTo(13.34f, 12.3f)
                lineTo(12f, 9.07f)
                lineTo(10.66f, 12.3f)
                horizontalLineTo(13.34f)
                close()
            }
        }.build()

        return _Angularjs!!
    }

@Suppress("ObjectPropertyName")
private var _Angularjs: ImageVector? = null
