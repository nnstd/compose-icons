package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.EarbudsOutline: ImageVector
    get() {
        if (_EarbudsOutline != null) {
            return _EarbudsOutline!!
        }
        _EarbudsOutline = ImageVector.Builder(
            name = "EarbudsOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 3f)
                curveTo(3f, 3f, 2f, 5f, 2f, 6f)
                verticalLineTo(11f)
                curveTo(2f, 12f, 3f, 14f, 5f, 14f)
                curveTo(5.61f, 14f, 6.32f, 13.72f, 7f, 13.27f)
                verticalLineTo(20f)
                curveTo(7f, 20.55f, 7.45f, 21f, 8f, 21f)
                horizontalLineTo(9f)
                curveTo(9.55f, 21f, 10f, 20.55f, 10f, 20f)
                verticalLineTo(8f)
                curveTo(10f, 6f, 7f, 3f, 5f, 3f)
                moveTo(8f, 10.23f)
                lineTo(5.91f, 11.6f)
                curveTo(5.4f, 11.93f, 5.08f, 12f, 5f, 12f)
                curveTo(4.3f, 12f, 4f, 11.08f, 4f, 11f)
                lineTo(4f, 6.03f)
                curveTo(4f, 5.92f, 4.3f, 5f, 5f, 5f)
                curveTo(5.9f, 5f, 8f, 7.1f, 8f, 8f)
                verticalLineTo(10.23f)
                moveTo(16.5f, 15f)
                curveTo(17.2f, 15f, 17.87f, 14.89f, 18.5f, 14.68f)
                verticalLineTo(20f)
                curveTo(18.5f, 20.55f, 18.05f, 21f, 17.5f, 21f)
                horizontalLineTo(15.5f)
                curveTo(14.95f, 21f, 14.5f, 20.55f, 14.5f, 20f)
                verticalLineTo(14.68f)
                curveTo(15.13f, 14.89f, 15.8f, 15f, 16.5f, 15f)
                moveTo(16.5f, 3f)
                curveTo(13.46f, 3f, 11f, 5.46f, 11f, 8.5f)
                reflectiveCurveTo(13.46f, 14f, 16.5f, 14f)
                reflectiveCurveTo(22f, 11.54f, 22f, 8.5f)
                reflectiveCurveTo(19.54f, 3f, 16.5f, 3f)
                moveTo(16.5f, 12f)
                curveTo(14.57f, 12f, 13f, 10.43f, 13f, 8.5f)
                reflectiveCurveTo(14.57f, 5f, 16.5f, 5f)
                reflectiveCurveTo(20f, 6.57f, 20f, 8.5f)
                reflectiveCurveTo(18.43f, 12f, 16.5f, 12f)
                close()
            }
        }.build()

        return _EarbudsOutline!!
    }

@Suppress("ObjectPropertyName")
private var _EarbudsOutline: ImageVector? = null
