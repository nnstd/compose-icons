package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.RefreshCircle: ImageVector
    get() {
        if (_RefreshCircle != null) {
            return _RefreshCircle!!
        }
        _RefreshCircle = ImageVector.Builder(
            name = "RefreshCircle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = true, isPositiveArc = false, 22f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 2f)
                moveTo(18f, 11f)
                horizontalLineTo(13f)
                lineTo(14.81f, 9.19f)
                arcTo(3.94f, 3.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 8f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = false, 15.86f, 13f)
                horizontalLineTo(17.91f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12f, 6f)
                arcTo(5.91f, 5.91f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.22f, 7.78f)
                lineTo(18f, 6f)
                close()
            }
        }.build()

        return _RefreshCircle!!
    }

@Suppress("ObjectPropertyName")
private var _RefreshCircle: ImageVector? = null
