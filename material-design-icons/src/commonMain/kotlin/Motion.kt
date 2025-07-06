package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Motion: ImageVector
    get() {
        if (_Motion != null) {
            return _Motion!!
        }
        _Motion = ImageVector.Builder(
            name = "Motion",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 13f)
                horizontalLineTo(3f)
                curveTo(2.45f, 13f, 2f, 12.55f, 2f, 12f)
                reflectiveCurveTo(2.45f, 11f, 3f, 11f)
                horizontalLineTo(7f)
                curveTo(7.55f, 11f, 8f, 11.45f, 8f, 12f)
                reflectiveCurveTo(7.55f, 13f, 7f, 13f)
                moveTo(6f, 8f)
                curveTo(6f, 7.45f, 5.55f, 7f, 5f, 7f)
                horizontalLineTo(4f)
                curveTo(3.45f, 7f, 3f, 7.45f, 3f, 8f)
                reflectiveCurveTo(3.45f, 9f, 4f, 9f)
                horizontalLineTo(5f)
                curveTo(5.55f, 9f, 6f, 8.55f, 6f, 8f)
                moveTo(22f, 12f)
                curveTo(22f, 14.76f, 19.76f, 17f, 17f, 17f)
                horizontalLineTo(4f)
                curveTo(3.45f, 17f, 3f, 16.55f, 3f, 16f)
                reflectiveCurveTo(3.45f, 15f, 4f, 15f)
                horizontalLineTo(13f)
                curveTo(12.58f, 14.42f, 12.25f, 13.74f, 12.1f, 13f)
                horizontalLineTo(10f)
                curveTo(9.45f, 13f, 9f, 12.55f, 9f, 12f)
                reflectiveCurveTo(9.45f, 11f, 10f, 11f)
                horizontalLineTo(12.1f)
                curveTo(12.25f, 10.26f, 12.58f, 9.58f, 13f, 9f)
                horizontalLineTo(8f)
                curveTo(7.45f, 9f, 7f, 8.55f, 7f, 8f)
                reflectiveCurveTo(7.45f, 7f, 8f, 7f)
                horizontalLineTo(17f)
                curveTo(19.76f, 7f, 22f, 9.24f, 22f, 12f)
                close()
            }
        }.build()

        return _Motion!!
    }

@Suppress("ObjectPropertyName")
private var _Motion: ImageVector? = null
