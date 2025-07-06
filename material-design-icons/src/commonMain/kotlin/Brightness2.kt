package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Brightness2: ImageVector
    get() {
        if (_Brightness2 != null) {
            return _Brightness2!!
        }
        _Brightness2 = ImageVector.Builder(
            name = "Brightness2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 2f)
                curveTo(8.18f, 2f, 6.47f, 2.5f, 5f, 3.35f)
                curveTo(8f, 5.08f, 10f, 8.3f, 10f, 12f)
                curveTo(10f, 15.7f, 8f, 18.92f, 5f, 20.65f)
                curveTo(6.47f, 21.5f, 8.18f, 22f, 10f, 22f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 2f)
                close()
            }
        }.build()

        return _Brightness2!!
    }

@Suppress("ObjectPropertyName")
private var _Brightness2: ImageVector? = null
