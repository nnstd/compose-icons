package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CheckUnderlineCircle: ImageVector
    get() {
        if (_CheckUnderlineCircle != null) {
            return _CheckUnderlineCircle!!
        }
        _CheckUnderlineCircle = ImageVector.Builder(
            name = "CheckUnderlineCircle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 22f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 2f)
                moveTo(17f, 18f)
                horizontalLineTo(7f)
                verticalLineTo(16f)
                horizontalLineTo(17f)
                verticalLineTo(18f)
                moveTo(10.3f, 14f)
                lineTo(7f, 10.7f)
                lineTo(8.4f, 9.3f)
                lineTo(10.3f, 11.2f)
                lineTo(15.6f, 5.9f)
                lineTo(17f, 7.3f)
                lineTo(10.3f, 14f)
                close()
            }
        }.build()

        return _CheckUnderlineCircle!!
    }

@Suppress("ObjectPropertyName")
private var _CheckUnderlineCircle: ImageVector? = null
