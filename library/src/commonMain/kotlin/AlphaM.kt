package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AlphaM: ImageVector
    get() {
        if (_AlphaM != null) {
            return _AlphaM!!
        }
        _AlphaM = ImageVector.Builder(
            name = "AlphaM",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 7f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 9f)
                verticalLineTo(17f)
                horizontalLineTo(9f)
                verticalLineTo(9f)
                horizontalLineTo(11f)
                verticalLineTo(16f)
                horizontalLineTo(13f)
                verticalLineTo(9f)
                horizontalLineTo(15f)
                verticalLineTo(17f)
                horizontalLineTo(17f)
                verticalLineTo(9f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 7f)
                horizontalLineTo(9f)
                close()
            }
        }.build()

        return _AlphaM!!
    }

@Suppress("ObjectPropertyName")
private var _AlphaM: ImageVector? = null
