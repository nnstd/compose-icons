package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.GarageVariant: ImageVector
    get() {
        if (_GarageVariant != null) {
            return _GarageVariant!!
        }
        _GarageVariant = ImageVector.Builder(
            name = "GarageVariant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 9f)
                verticalLineTo(20f)
                horizontalLineTo(20f)
                verticalLineTo(11f)
                horizontalLineTo(4f)
                verticalLineTo(20f)
                horizontalLineTo(2f)
                verticalLineTo(9f)
                lineTo(12f, 5f)
                lineTo(22f, 9f)
                moveTo(19f, 12f)
                horizontalLineTo(5f)
                verticalLineTo(14f)
                horizontalLineTo(19f)
                verticalLineTo(12f)
                moveTo(19f, 18f)
                horizontalLineTo(5f)
                verticalLineTo(20f)
                horizontalLineTo(19f)
                verticalLineTo(18f)
                moveTo(19f, 15f)
                horizontalLineTo(5f)
                verticalLineTo(17f)
                horizontalLineTo(19f)
                verticalLineTo(15f)
                close()
            }
        }.build()

        return _GarageVariant!!
    }

@Suppress("ObjectPropertyName")
private var _GarageVariant: ImageVector? = null
