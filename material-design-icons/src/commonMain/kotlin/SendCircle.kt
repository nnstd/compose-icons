package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SendCircle: ImageVector
    get() {
        if (_SendCircle != null) {
            return _SendCircle!!
        }
        _SendCircle = ImageVector.Builder(
            name = "SendCircle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 22f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 2f)
                moveTo(8f, 7.71f)
                verticalLineTo(11.05f)
                lineTo(15.14f, 12f)
                lineTo(8f, 12.95f)
                verticalLineTo(16.29f)
                lineTo(18f, 12f)
                lineTo(8f, 7.71f)
                close()
            }
        }.build()

        return _SendCircle!!
    }

@Suppress("ObjectPropertyName")
private var _SendCircle: ImageVector? = null
