package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ShieldPlus: ImageVector
    get() {
        if (_ShieldPlus != null) {
            return _ShieldPlus!!
        }
        _ShieldPlus = ImageVector.Builder(
            name = "ShieldPlus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 20f)
                verticalLineTo(22.97f)
                horizontalLineTo(17f)
                verticalLineTo(20f)
                horizontalLineTo(14f)
                verticalLineTo(18f)
                horizontalLineTo(17f)
                verticalLineTo(15f)
                horizontalLineTo(19f)
                verticalLineTo(18f)
                horizontalLineTo(22f)
                verticalLineTo(20f)
                horizontalLineTo(19f)
                moveTo(12f, 1f)
                lineTo(21f, 5f)
                verticalLineTo(11f)
                curveTo(21f, 11.9f, 20.9f, 12.78f, 20.71f, 13.65f)
                curveTo(19.9f, 13.23f, 19f, 13f, 18f, 13f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 19f)
                curveTo(12f, 20.36f, 12.45f, 21.62f, 13.22f, 22.62f)
                lineTo(12f, 23f)
                curveTo(6.84f, 21.74f, 3f, 16.55f, 3f, 11f)
                verticalLineTo(5f)
                lineTo(12f, 1f)
                close()
            }
        }.build()

        return _ShieldPlus!!
    }

@Suppress("ObjectPropertyName")
private var _ShieldPlus: ImageVector? = null
