package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Brightness3: ImageVector
    get() {
        if (_Brightness3 != null) {
            return _Brightness3!!
        }
        _Brightness3 = ImageVector.Builder(
            name = "Brightness3",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 2f)
                curveTo(7.95f, 2f, 6.95f, 2.16f, 6f, 2.46f)
                curveTo(10.06f, 3.73f, 13f, 7.5f, 13f, 12f)
                curveTo(13f, 16.5f, 10.06f, 20.27f, 6f, 21.54f)
                curveTo(6.95f, 21.84f, 7.95f, 22f, 9f, 22f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 2f)
                close()
            }
        }.build()

        return _Brightness3!!
    }

@Suppress("ObjectPropertyName")
private var _Brightness3: ImageVector? = null
