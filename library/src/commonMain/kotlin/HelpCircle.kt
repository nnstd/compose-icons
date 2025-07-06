package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HelpCircle: ImageVector
    get() {
        if (_HelpCircle != null) {
            return _HelpCircle!!
        }
        _HelpCircle = ImageVector.Builder(
            name = "HelpCircle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.07f, 11.25f)
                lineTo(14.17f, 12.17f)
                curveTo(13.45f, 12.89f, 13f, 13.5f, 13f, 15f)
                horizontalLineTo(11f)
                verticalLineTo(14.5f)
                curveTo(11f, 13.39f, 11.45f, 12.39f, 12.17f, 11.67f)
                lineTo(13.41f, 10.41f)
                curveTo(13.78f, 10.05f, 14f, 9.55f, 14f, 9f)
                curveTo(14f, 7.89f, 13.1f, 7f, 12f, 7f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 9f)
                horizontalLineTo(8f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 5f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 9f)
                curveTo(16f, 9.88f, 15.64f, 10.67f, 15.07f, 11.25f)
                moveTo(13f, 19f)
                horizontalLineTo(11f)
                verticalLineTo(17f)
                horizontalLineTo(13f)
                moveTo(12f, 2f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 22f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 12f)
                curveTo(22f, 6.47f, 17.5f, 2f, 12f, 2f)
                close()
            }
        }.build()

        return _HelpCircle!!
    }

@Suppress("ObjectPropertyName")
private var _HelpCircle: ImageVector? = null
