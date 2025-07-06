package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PhoneMessageOutline: ImageVector
    get() {
        if (_PhoneMessageOutline != null) {
            return _PhoneMessageOutline!!
        }
        _PhoneMessageOutline = ImageVector.Builder(
            name = "PhoneMessageOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 15.5f)
                curveTo(18.75f, 15.5f, 17.55f, 15.3f, 16.43f, 14.93f)
                curveTo(16.33f, 14.9f, 16.22f, 14.88f, 16.12f, 14.88f)
                curveTo(15.86f, 14.88f, 15.61f, 15f, 15.41f, 15.17f)
                lineTo(13.21f, 17.37f)
                curveTo(10.38f, 15.93f, 8.06f, 13.62f, 6.62f, 10.79f)
                lineTo(8.82f, 8.58f)
                curveTo(9.1f, 8.31f, 9.18f, 7.92f, 9.07f, 7.57f)
                curveTo(8.7f, 6.45f, 8.5f, 5.25f, 8.5f, 4f)
                curveTo(8.5f, 3.45f, 8.05f, 3f, 7.5f, 3f)
                horizontalLineTo(4f)
                curveTo(3.45f, 3f, 3f, 3.45f, 3f, 4f)
                curveTo(3f, 13.39f, 10.61f, 21f, 20f, 21f)
                curveTo(20.55f, 21f, 21f, 20.55f, 21f, 20f)
                verticalLineTo(16.5f)
                curveTo(21f, 15.95f, 20.55f, 15.5f, 20f, 15.5f)
                moveTo(5.03f, 5f)
                horizontalLineTo(6.53f)
                curveTo(6.6f, 5.88f, 6.75f, 6.75f, 7f, 7.59f)
                lineTo(5.79f, 8.8f)
                curveTo(5.38f, 7.59f, 5.12f, 6.32f, 5.03f, 5f)
                moveTo(19f, 18.97f)
                curveTo(17.68f, 18.88f, 16.4f, 18.62f, 15.2f, 18.21f)
                lineTo(16.4f, 17f)
                curveTo(17.25f, 17.25f, 18.12f, 17.4f, 19f, 17.46f)
                verticalLineTo(18.97f)
                moveTo(12f, 3f)
                verticalLineTo(13f)
                lineTo(15f, 10f)
                horizontalLineTo(21f)
                verticalLineTo(3f)
                horizontalLineTo(12f)
                moveTo(19f, 8f)
                horizontalLineTo(14f)
                verticalLineTo(5f)
                horizontalLineTo(19f)
                verticalLineTo(8f)
                close()
            }
        }.build()

        return _PhoneMessageOutline!!
    }

@Suppress("ObjectPropertyName")
private var _PhoneMessageOutline: ImageVector? = null
