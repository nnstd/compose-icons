package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SendVariantClockOutline: ImageVector
    get() {
        if (_SendVariantClockOutline != null) {
            return _SendVariantClockOutline!!
        }
        _SendVariantClockOutline = ImageVector.Builder(
            name = "SendVariantClockOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 16.69f)
                verticalLineTo(13f)
                horizontalLineTo(16.5f)
                verticalLineTo(15.82f)
                lineTo(18.94f, 17.23f)
                lineTo(18.19f, 18.53f)
                lineTo(15f, 16.69f)
                moveTo(21.63f, 11.85f)
                lineTo(22f, 12f)
                lineTo(21.8f, 12.08f)
                curveTo(22.58f, 13.23f, 23f, 14.59f, 23f, 16f)
                curveTo(23f, 19.87f, 19.86f, 23f, 16f, 23f)
                curveTo(14.14f, 23f, 12.36f, 22.26f, 11.05f, 20.95f)
                curveTo(10.08f, 20f, 9.42f, 18.74f, 9.14f, 17.41f)
                lineTo(3f, 20f)
                verticalLineTo(4f)
                lineTo(15.03f, 9.07f)
                curveTo(15.35f, 9f, 15.67f, 9f, 16f, 9f)
                curveTo(17.86f, 9f, 19.64f, 9.74f, 20.95f, 11.05f)
                curveTo(21.2f, 11.3f, 21.43f, 11.57f, 21.63f, 11.85f)
                moveTo(12.28f, 10.07f)
                lineTo(5f, 7f)
                verticalLineTo(10.5f)
                lineTo(10.37f, 11.84f)
                curveTo(10.89f, 11.14f, 11.54f, 10.54f, 12.28f, 10.07f)
                moveTo(10.11f, 12.22f)
                lineTo(5f, 13.5f)
                verticalLineTo(17f)
                lineTo(9.04f, 15.3f)
                curveTo(9.15f, 14.17f, 9.53f, 13.13f, 10.11f, 12.22f)
                moveTo(20.85f, 16f)
                curveTo(20.85f, 13.32f, 18.67f, 11.15f, 16f, 11.15f)
                curveTo(14.71f, 11.15f, 13.5f, 11.66f, 12.57f, 12.57f)
                curveTo(11.66f, 13.5f, 11.15f, 14.71f, 11.15f, 16f)
                curveTo(11.15f, 18.68f, 13.32f, 20.85f, 16f, 20.85f)
                curveTo(16.64f, 20.85f, 17.27f, 20.73f, 17.86f, 20.5f)
                curveTo(18.44f, 20.24f, 19f, 19.88f, 19.43f, 19.43f)
                curveTo(19.88f, 19f, 20.24f, 18.44f, 20.5f, 17.86f)
                curveTo(20.73f, 17.27f, 20.85f, 16.64f, 20.85f, 16f)
                close()
            }
        }.build()

        return _SendVariantClockOutline!!
    }

@Suppress("ObjectPropertyName")
private var _SendVariantClockOutline: ImageVector? = null
