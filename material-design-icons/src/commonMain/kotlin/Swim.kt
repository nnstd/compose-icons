package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Swim: ImageVector
    get() {
        if (_Swim != null) {
            return _Swim!!
        }
        _Swim = ImageVector.Builder(
            name = "Swim",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 18f)
                curveTo(4.22f, 17f, 6.44f, 16f, 8.67f, 16f)
                curveTo(10.89f, 16f, 13.11f, 18f, 15.33f, 18f)
                curveTo(17.56f, 18f, 19.78f, 16f, 22f, 16f)
                verticalLineTo(19f)
                curveTo(19.78f, 19f, 17.56f, 21f, 15.33f, 21f)
                curveTo(13.11f, 21f, 10.89f, 19f, 8.67f, 19f)
                curveTo(6.44f, 19f, 4.22f, 20f, 2f, 21f)
                verticalLineTo(18f)
                moveTo(8.67f, 13f)
                curveTo(7.89f, 13f, 7.12f, 13.12f, 6.35f, 13.32f)
                lineTo(11.27f, 9.88f)
                lineTo(10.23f, 8.64f)
                curveTo(10.09f, 8.47f, 10f, 8.24f, 10f, 8f)
                curveTo(10f, 7.66f, 10.17f, 7.35f, 10.44f, 7.17f)
                lineTo(16.16f, 3.17f)
                lineTo(17.31f, 4.8f)
                lineTo(12.47f, 8.19f)
                lineTo(17.7f, 14.42f)
                curveTo(16.91f, 14.75f, 16.12f, 15f, 15.33f, 15f)
                curveTo(13.11f, 15f, 10.89f, 13f, 8.67f, 13f)
                moveTo(18f, 7f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 9f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 11f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 9f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 7f)
                close()
            }
        }.build()

        return _Swim!!
    }

@Suppress("ObjectPropertyName")
private var _Swim: ImageVector? = null
