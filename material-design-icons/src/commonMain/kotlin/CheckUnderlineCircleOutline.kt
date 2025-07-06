package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CheckUnderlineCircleOutline: ImageVector
    get() {
        if (_CheckUnderlineCircleOutline != null) {
            return _CheckUnderlineCircleOutline!!
        }
        _CheckUnderlineCircleOutline = ImageVector.Builder(
            name = "CheckUnderlineCircleOutline",
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
                moveTo(12f, 20f)
                curveTo(7.59f, 20f, 4f, 16.41f, 4f, 12f)
                curveTo(4f, 7.59f, 7.59f, 4f, 12f, 4f)
                curveTo(16.41f, 4f, 20f, 7.59f, 20f, 12f)
                curveTo(20f, 16.41f, 16.41f, 20f, 12f, 20f)
                moveTo(7f, 15f)
                horizontalLineTo(17f)
                verticalLineTo(17f)
                horizontalLineTo(7f)
                verticalLineTo(15f)
                moveTo(10.3f, 11.2f)
                lineTo(8.4f, 9.3f)
                lineTo(7f, 10.7f)
                lineTo(10.3f, 14f)
                lineTo(17f, 7.3f)
                lineTo(15.6f, 5.9f)
                lineTo(10.3f, 11.2f)
                close()
            }
        }.build()

        return _CheckUnderlineCircleOutline!!
    }

@Suppress("ObjectPropertyName")
private var _CheckUnderlineCircleOutline: ImageVector? = null
