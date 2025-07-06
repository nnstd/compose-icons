package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CartVariant: ImageVector
    get() {
        if (_CartVariant != null) {
            return _CartVariant!!
        }
        _CartVariant = ImageVector.Builder(
            name = "CartVariant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 20f)
                curveTo(19f, 21.11f, 18.11f, 22f, 17f, 22f)
                curveTo(15.89f, 22f, 15f, 21.1f, 15f, 20f)
                curveTo(15f, 18.89f, 15.89f, 18f, 17f, 18f)
                curveTo(18.11f, 18f, 19f, 18.9f, 19f, 20f)
                moveTo(7f, 18f)
                curveTo(5.89f, 18f, 5f, 18.89f, 5f, 20f)
                curveTo(5f, 21.1f, 5.89f, 22f, 7f, 22f)
                curveTo(8.11f, 22f, 9f, 21.11f, 9f, 20f)
                reflectiveCurveTo(8.11f, 18f, 7f, 18f)
                moveTo(7.2f, 14.63f)
                lineTo(7.17f, 14.75f)
                curveTo(7.17f, 14.89f, 7.28f, 15f, 7.42f, 15f)
                horizontalLineTo(19f)
                verticalLineTo(17f)
                horizontalLineTo(7f)
                curveTo(5.89f, 17f, 5f, 16.1f, 5f, 15f)
                curveTo(5f, 14.65f, 5.09f, 14.32f, 5.24f, 14.04f)
                lineTo(6.6f, 11.59f)
                lineTo(3f, 4f)
                horizontalLineTo(1f)
                verticalLineTo(2f)
                horizontalLineTo(4.27f)
                lineTo(5.21f, 4f)
                horizontalLineTo(20f)
                curveTo(20.55f, 4f, 21f, 4.45f, 21f, 5f)
                curveTo(21f, 5.17f, 20.95f, 5.34f, 20.88f, 5.5f)
                lineTo(17.3f, 11.97f)
                curveTo(16.96f, 12.58f, 16.3f, 13f, 15.55f, 13f)
                horizontalLineTo(8.1f)
                lineTo(7.2f, 14.63f)
                moveTo(8.5f, 11f)
                horizontalLineTo(10f)
                verticalLineTo(9f)
                horizontalLineTo(7.56f)
                lineTo(8.5f, 11f)
                moveTo(11f, 9f)
                verticalLineTo(11f)
                horizontalLineTo(14f)
                verticalLineTo(9f)
                horizontalLineTo(11f)
                moveTo(14f, 8f)
                verticalLineTo(6f)
                horizontalLineTo(11f)
                verticalLineTo(8f)
                horizontalLineTo(14f)
                moveTo(17.11f, 9f)
                horizontalLineTo(15f)
                verticalLineTo(11f)
                horizontalLineTo(16f)
                lineTo(17.11f, 9f)
                moveTo(18.78f, 6f)
                horizontalLineTo(15f)
                verticalLineTo(8f)
                horizontalLineTo(17.67f)
                lineTo(18.78f, 6f)
                moveTo(6.14f, 6f)
                lineTo(7.08f, 8f)
                horizontalLineTo(10f)
                verticalLineTo(6f)
                horizontalLineTo(6.14f)
                close()
            }
        }.build()

        return _CartVariant!!
    }

@Suppress("ObjectPropertyName")
private var _CartVariant: ImageVector? = null
