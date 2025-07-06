package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArrowProjectile: ImageVector
    get() {
        if (_ArrowProjectile != null) {
            return _ArrowProjectile!!
        }
        _ArrowProjectile = ImageVector.Builder(
            name = "ArrowProjectile",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 2f)
                lineTo(20f, 7f)
                lineTo(19.03f, 6.03f)
                lineTo(8f, 17.06f)
                verticalLineTo(19f)
                lineTo(5f, 22f)
                lineTo(4f, 20f)
                lineTo(2f, 19f)
                lineTo(5f, 16f)
                horizontalLineTo(6.94f)
                lineTo(17.97f, 4.97f)
                lineTo(17f, 4f)
                lineTo(22f, 2f)
                close()
            }
        }.build()

        return _ArrowProjectile!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowProjectile: ImageVector? = null
