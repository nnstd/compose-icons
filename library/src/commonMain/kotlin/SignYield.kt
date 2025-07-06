package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SignYield: ImageVector
    get() {
        if (_SignYield != null) {
            return _SignYield!!
        }
        _SignYield = ImageVector.Builder(
            name = "SignYield",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.5f, 3f)
                horizontalLineTo(3.5f)
                curveTo(2.4f, 3f, 1.6f, 4.3f, 2.2f, 5.3f)
                lineTo(10.7f, 20.2f)
                curveTo(11f, 20.7f, 11.5f, 21f, 12f, 21f)
                reflectiveCurveTo(13f, 20.7f, 13.3f, 20.2f)
                lineTo(21.8f, 5.3f)
                curveTo(22.4f, 4.3f, 21.6f, 3f, 20.5f, 3f)
                moveTo(12f, 18.5f)
                lineTo(4.3f, 5f)
                horizontalLineTo(19.6f)
                lineTo(12f, 18.5f)
                moveTo(6.9f, 6.5f)
                horizontalLineTo(17.1f)
                lineTo(12f, 15.5f)
                lineTo(6.9f, 6.5f)
                close()
            }
        }.build()

        return _SignYield!!
    }

@Suppress("ObjectPropertyName")
private var _SignYield: ImageVector? = null
