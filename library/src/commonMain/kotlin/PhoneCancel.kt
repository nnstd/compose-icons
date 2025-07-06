package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PhoneCancel: ImageVector
    get() {
        if (_PhoneCancel != null) {
            return _PhoneCancel!!
        }
        _PhoneCancel = ImageVector.Builder(
            name = "PhoneCancel",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.62f, 10.79f)
                curveTo(8.06f, 13.62f, 10.38f, 15.94f, 13.21f, 17.38f)
                lineTo(15.41f, 15.18f)
                curveTo(15.69f, 14.9f, 16.08f, 14.82f, 16.43f, 14.93f)
                curveTo(17.55f, 15.3f, 18.75f, 15.5f, 20f, 15.5f)
                curveTo(20.55f, 15.5f, 21f, 15.95f, 21f, 16.5f)
                verticalLineTo(20f)
                curveTo(21f, 20.55f, 20.55f, 21f, 20f, 21f)
                curveTo(10.61f, 21f, 3f, 13.39f, 3f, 4f)
                curveTo(3f, 3.45f, 3.45f, 3f, 4f, 3f)
                horizontalLineTo(7.5f)
                curveTo(8.05f, 3f, 8.5f, 3.45f, 8.5f, 4f)
                curveTo(8.5f, 5.25f, 8.7f, 6.45f, 9.07f, 7.57f)
                curveTo(9.18f, 7.92f, 9.1f, 8.31f, 8.82f, 8.59f)
                lineTo(6.62f, 10.79f)
                moveTo(16.5f, 2f)
                curveTo(14f, 2f, 12f, 4f, 12f, 6.5f)
                reflectiveCurveTo(14f, 11f, 16.5f, 11f)
                reflectiveCurveTo(21f, 9f, 21f, 6.5f)
                reflectiveCurveTo(19f, 2f, 16.5f, 2f)
                moveTo(16.5f, 9.5f)
                curveTo(14.84f, 9.5f, 13.5f, 8.16f, 13.5f, 6.5f)
                curveTo(13.5f, 5.94f, 13.65f, 5.42f, 13.92f, 5f)
                lineTo(18f, 9.08f)
                curveTo(17.58f, 9.35f, 17.06f, 9.5f, 16.5f, 9.5f)
                moveTo(19.08f, 8f)
                lineTo(15f, 3.92f)
                curveTo(15.42f, 3.65f, 15.94f, 3.5f, 16.5f, 3.5f)
                curveTo(18.16f, 3.5f, 19.5f, 4.84f, 19.5f, 6.5f)
                curveTo(19.5f, 7.06f, 19.35f, 7.58f, 19.08f, 8f)
                close()
            }
        }.build()

        return _PhoneCancel!!
    }

@Suppress("ObjectPropertyName")
private var _PhoneCancel: ImageVector? = null
