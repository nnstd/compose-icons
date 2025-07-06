package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Umbrella: ImageVector
    get() {
        if (_Umbrella != null) {
            return _Umbrella!!
        }
        _Umbrella = ImageVector.Builder(
            name = "Umbrella",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                arcTo(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 11f)
                horizontalLineTo(13f)
                verticalLineTo(19f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 22f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 19f)
                verticalLineTo(18f)
                horizontalLineTo(9f)
                verticalLineTo(19f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 20f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 19f)
                verticalLineTo(11f)
                horizontalLineTo(3f)
                arcTo(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 2f)
                close()
            }
        }.build()

        return _Umbrella!!
    }

@Suppress("ObjectPropertyName")
private var _Umbrella: ImageVector? = null
