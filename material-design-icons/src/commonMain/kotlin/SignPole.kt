package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SignPole: ImageVector
    get() {
        if (_SignPole != null) {
            return _SignPole!!
        }
        _SignPole = ImageVector.Builder(
            name = "SignPole",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 3f)
                lineTo(12f, 2f)
                lineTo(13f, 3f)
                verticalLineTo(20f)
                curveTo(14.11f, 20f, 15f, 20.9f, 15f, 22f)
                horizontalLineTo(9f)
                curveTo(9f, 20.9f, 9.9f, 20f, 11f, 20f)
                verticalLineTo(3f)
                close()
            }
        }.build()

        return _SignPole!!
    }

@Suppress("ObjectPropertyName")
private var _SignPole: ImageVector? = null
