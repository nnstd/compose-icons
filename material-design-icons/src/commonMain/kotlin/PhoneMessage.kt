package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PhoneMessage: ImageVector
    get() {
        if (_PhoneMessage != null) {
            return _PhoneMessage!!
        }
        _PhoneMessage = ImageVector.Builder(
            name = "PhoneMessage",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 15.5f)
                curveTo(18.75f, 15.5f, 17.55f, 15.3f, 16.43f, 14.93f)
                curveTo(16.08f, 14.82f, 15.69f, 14.9f, 15.41f, 15.17f)
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
                moveTo(12f, 3f)
                verticalLineTo(13f)
                lineTo(15f, 10f)
                horizontalLineTo(21f)
                verticalLineTo(3f)
                horizontalLineTo(12f)
                close()
            }
        }.build()

        return _PhoneMessage!!
    }

@Suppress("ObjectPropertyName")
private var _PhoneMessage: ImageVector? = null
