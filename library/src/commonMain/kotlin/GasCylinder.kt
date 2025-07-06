package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.GasCylinder: ImageVector
    get() {
        if (_GasCylinder != null) {
            return _GasCylinder!!
        }
        _GasCylinder = ImageVector.Builder(
            name = "GasCylinder",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 9f)
                verticalLineTo(14f)
                lineTo(16f, 20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 22f)
                horizontalLineTo(10f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 20f)
                verticalLineTo(14f)
                lineTo(8f, 9f)
                curveTo(8f, 7.14f, 9.27f, 5.57f, 11f, 5.13f)
                verticalLineTo(4f)
                horizontalLineTo(9f)
                verticalLineTo(2f)
                horizontalLineTo(15f)
                verticalLineTo(4f)
                horizontalLineTo(13f)
                verticalLineTo(5.13f)
                curveTo(14.73f, 5.57f, 16f, 7.14f, 16f, 9f)
                close()
            }
        }.build()

        return _GasCylinder!!
    }

@Suppress("ObjectPropertyName")
private var _GasCylinder: ImageVector? = null
