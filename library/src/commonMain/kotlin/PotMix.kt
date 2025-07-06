package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PotMix: ImageVector
    get() {
        if (_PotMix != null) {
            return _PotMix!!
        }
        _PotMix = ImageVector.Builder(
            name = "PotMix",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.6f, 9f)
                lineTo(18f, 3.1f)
                lineTo(19.7f, 4.1f)
                lineTo(16.9f, 9f)
                horizontalLineTo(14.6f)
                moveTo(14f, 10f)
                horizontalLineTo(3f)
                verticalLineTo(12f)
                horizontalLineTo(5f)
                verticalLineTo(19f)
                curveTo(5f, 20.1f, 5.9f, 21f, 7f, 21f)
                horizontalLineTo(17f)
                curveTo(18.1f, 21f, 19f, 20.1f, 19f, 19f)
                verticalLineTo(12f)
                horizontalLineTo(21f)
                verticalLineTo(10f)
                horizontalLineTo(14f)
                close()
            }
        }.build()

        return _PotMix!!
    }

@Suppress("ObjectPropertyName")
private var _PotMix: ImageVector? = null
