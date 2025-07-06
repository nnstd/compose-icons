package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArrowProjectileMultiple: ImageVector
    get() {
        if (_ArrowProjectileMultiple != null) {
            return _ArrowProjectileMultiple!!
        }
        _ArrowProjectileMultiple = ImageVector.Builder(
            name = "ArrowProjectileMultiple",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 16f)
                lineTo(22f, 19f)
                lineTo(20f, 20f)
                lineTo(19f, 22f)
                lineTo(16f, 19f)
                verticalLineTo(17.06f)
                lineTo(12f, 13.06f)
                lineTo(8f, 17.06f)
                verticalLineTo(19f)
                lineTo(5f, 22f)
                lineTo(4f, 20f)
                lineTo(2f, 19f)
                lineTo(5f, 16f)
                horizontalLineTo(6.94f)
                lineTo(10.94f, 12f)
                lineTo(4.97f, 6.03f)
                lineTo(4f, 7f)
                lineTo(2f, 2f)
                lineTo(7f, 4f)
                lineTo(6.03f, 4.97f)
                lineTo(12f, 10.94f)
                lineTo(17.97f, 4.97f)
                lineTo(17f, 4f)
                lineTo(22f, 2f)
                lineTo(20f, 7f)
                lineTo(19.03f, 6.03f)
                lineTo(13.06f, 12f)
                lineTo(17.06f, 16f)
                horizontalLineTo(19f)
                close()
            }
        }.build()

        return _ArrowProjectileMultiple!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowProjectileMultiple: ImageVector? = null
