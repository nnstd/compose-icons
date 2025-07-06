package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.GarageAlertVariant: ImageVector
    get() {
        if (_GarageAlertVariant != null) {
            return _GarageAlertVariant!!
        }
        _GarageAlertVariant = ImageVector.Builder(
            name = "GarageAlertVariant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 9f)
                verticalLineTo(20f)
                horizontalLineTo(18f)
                verticalLineTo(11f)
                horizontalLineTo(2f)
                verticalLineTo(20f)
                horizontalLineTo(0f)
                verticalLineTo(9f)
                lineTo(10f, 5f)
                lineTo(20f, 9f)
                moveTo(17f, 12f)
                horizontalLineTo(3f)
                verticalLineTo(14f)
                horizontalLineTo(17f)
                verticalLineTo(12f)
                moveTo(17f, 15f)
                horizontalLineTo(3f)
                verticalLineTo(17f)
                horizontalLineTo(17f)
                verticalLineTo(15f)
                moveTo(22f, 15f)
                verticalLineTo(10f)
                horizontalLineTo(24f)
                verticalLineTo(15f)
                horizontalLineTo(22f)
                moveTo(22f, 19f)
                verticalLineTo(17f)
                horizontalLineTo(24f)
                verticalLineTo(19f)
                horizontalLineTo(22f)
                close()
            }
        }.build()

        return _GarageAlertVariant!!
    }

@Suppress("ObjectPropertyName")
private var _GarageAlertVariant: ImageVector? = null
