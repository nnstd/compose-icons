package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BriefcaseEyeOutline: ImageVector
    get() {
        if (_BriefcaseEyeOutline != null) {
            return _BriefcaseEyeOutline!!
        }
        _BriefcaseEyeOutline = ImageVector.Builder(
            name = "BriefcaseEyeOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 18f)
                curveTo(17.6f, 18f, 18f, 18.4f, 18f, 19f)
                reflectiveCurveTo(17.6f, 20f, 17f, 20f)
                reflectiveCurveTo(16f, 19.6f, 16f, 19f)
                reflectiveCurveTo(16.4f, 18f, 17f, 18f)
                moveTo(17f, 15f)
                curveTo(14.3f, 15f, 11.9f, 16.7f, 11f, 19f)
                curveTo(11.9f, 21.3f, 14.3f, 23f, 17f, 23f)
                reflectiveCurveTo(22.1f, 21.3f, 23f, 19f)
                curveTo(22.1f, 16.7f, 19.7f, 15f, 17f, 15f)
                moveTo(17f, 21.5f)
                curveTo(15.6f, 21.5f, 14.5f, 20.4f, 14.5f, 19f)
                reflectiveCurveTo(15.6f, 16.5f, 17f, 16.5f)
                reflectiveCurveTo(19.5f, 17.6f, 19.5f, 19f)
                reflectiveCurveTo(18.4f, 21.5f, 17f, 21.5f)
                moveTo(9.1f, 19.7f)
                lineTo(8.8f, 19f)
                horizontalLineTo(4f)
                verticalLineTo(8f)
                horizontalLineTo(20f)
                verticalLineTo(13.6f)
                curveTo(20.7f, 13.9f, 21.4f, 14.2f, 22f, 14.7f)
                verticalLineTo(8f)
                curveTo(22f, 7.5f, 21.8f, 7f, 21.4f, 6.6f)
                curveTo(21f, 6.2f, 20.6f, 6f, 20f, 6f)
                horizontalLineTo(16f)
                verticalLineTo(4f)
                curveTo(16f, 3.4f, 15.8f, 3f, 15.4f, 2.6f)
                curveTo(15f, 2.2f, 14.6f, 2f, 14f, 2f)
                horizontalLineTo(10f)
                curveTo(9.4f, 2f, 9f, 2.2f, 8.6f, 2.6f)
                curveTo(8.2f, 3f, 8f, 3.4f, 8f, 4f)
                verticalLineTo(6f)
                horizontalLineTo(4f)
                curveTo(3.4f, 6f, 3f, 6.2f, 2.6f, 6.6f)
                curveTo(2.2f, 7f, 2f, 7.5f, 2f, 8f)
                verticalLineTo(19f)
                curveTo(2f, 19.5f, 2.2f, 20f, 2.6f, 20.4f)
                curveTo(3f, 20.8f, 3.4f, 21f, 4f, 21f)
                horizontalLineTo(9.8f)
                curveTo(9.5f, 20.6f, 9.3f, 20.2f, 9.1f, 19.7f)
                moveTo(10f, 4f)
                horizontalLineTo(14f)
                verticalLineTo(6f)
                horizontalLineTo(10f)
                verticalLineTo(4f)
                close()
            }
        }.build()

        return _BriefcaseEyeOutline!!
    }

@Suppress("ObjectPropertyName")
private var _BriefcaseEyeOutline: ImageVector? = null
