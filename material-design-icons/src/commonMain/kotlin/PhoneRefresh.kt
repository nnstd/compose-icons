package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PhoneRefresh: ImageVector
    get() {
        if (_PhoneRefresh != null) {
            return _PhoneRefresh!!
        }
        _PhoneRefresh = ImageVector.Builder(
            name = "PhoneRefresh",
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
                moveTo(17f, 7f)
                lineTo(18.77f, 5.23f)
                curveTo(18.32f, 4.78f, 17.69f, 4.5f, 17f, 4.5f)
                curveTo(15.62f, 4.5f, 14.5f, 5.62f, 14.5f, 7f)
                reflectiveCurveTo(15.62f, 9.5f, 17f, 9.5f)
                curveTo(17.82f, 9.5f, 18.54f, 9.11f, 19f, 8.5f)
                horizontalLineTo(20.71f)
                curveTo(20.12f, 9.97f, 18.68f, 11f, 17f, 11f)
                curveTo(14.79f, 11f, 13f, 9.21f, 13f, 7f)
                reflectiveCurveTo(14.79f, 3f, 17f, 3f)
                curveTo(18.11f, 3f, 19.11f, 3.45f, 19.83f, 4.17f)
                lineTo(21f, 3f)
                verticalLineTo(7f)
                horizontalLineTo(17f)
                close()
            }
        }.build()

        return _PhoneRefresh!!
    }

@Suppress("ObjectPropertyName")
private var _PhoneRefresh: ImageVector? = null
