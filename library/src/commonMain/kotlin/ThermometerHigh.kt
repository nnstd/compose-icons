package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ThermometerHigh: ImageVector
    get() {
        if (_ThermometerHigh != null) {
            return _ThermometerHigh!!
        }
        _ThermometerHigh = ImageVector.Builder(
            name = "ThermometerHigh",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 13f)
                verticalLineTo(5f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 5f)
                verticalLineTo(13f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 15f, 13f)
                moveTo(12f, 4f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 5f)
                horizontalLineTo(11f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 4f)
                close()
            }
        }.build()

        return _ThermometerHigh!!
    }

@Suppress("ObjectPropertyName")
private var _ThermometerHigh: ImageVector? = null
