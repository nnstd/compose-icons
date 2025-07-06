package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ShieldCrown: ImageVector
    get() {
        if (_ShieldCrown != null) {
            return _ShieldCrown!!
        }
        _ShieldCrown = ImageVector.Builder(
            name = "ShieldCrown",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 1f)
                lineTo(21f, 5f)
                verticalLineTo(11f)
                curveTo(21f, 16.55f, 17.16f, 21.74f, 12f, 23f)
                curveTo(6.84f, 21.74f, 3f, 16.55f, 3f, 11f)
                verticalLineTo(5f)
                lineTo(12f, 1f)
                moveTo(16f, 14f)
                horizontalLineTo(8f)
                verticalLineTo(15.5f)
                curveTo(8f, 15.77f, 8.19f, 15.96f, 8.47f, 16f)
                lineTo(8.57f, 16f)
                horizontalLineTo(15.43f)
                curveTo(15.74f, 16f, 15.95f, 15.84f, 16f, 15.59f)
                lineTo(16f, 15.5f)
                verticalLineTo(14f)
                moveTo(17f, 8f)
                lineTo(17f, 8f)
                lineTo(14.33f, 10.67f)
                lineTo(12f, 8.34f)
                lineTo(9.67f, 10.67f)
                lineTo(7f, 8f)
                lineTo(7f, 8f)
                lineTo(8f, 13f)
                horizontalLineTo(16f)
                lineTo(17f, 8f)
                close()
            }
        }.build()

        return _ShieldCrown!!
    }

@Suppress("ObjectPropertyName")
private var _ShieldCrown: ImageVector? = null
