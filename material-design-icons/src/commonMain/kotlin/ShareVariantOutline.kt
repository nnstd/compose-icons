package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ShareVariantOutline: ImageVector
    get() {
        if (_ShareVariantOutline != null) {
            return _ShareVariantOutline!!
        }
        _ShareVariantOutline = ImageVector.Builder(
            name = "ShareVariantOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 16.08f)
                curveTo(17.24f, 16.08f, 16.56f, 16.38f, 16.04f, 16.85f)
                lineTo(8.91f, 12.7f)
                curveTo(8.96f, 12.47f, 9f, 12.24f, 9f, 12f)
                reflectiveCurveTo(8.96f, 11.53f, 8.91f, 11.3f)
                lineTo(15.96f, 7.19f)
                curveTo(16.5f, 7.69f, 17.21f, 8f, 18f, 8f)
                curveTo(19.66f, 8f, 21f, 6.66f, 21f, 5f)
                reflectiveCurveTo(19.66f, 2f, 18f, 2f)
                reflectiveCurveTo(15f, 3.34f, 15f, 5f)
                curveTo(15f, 5.24f, 15.04f, 5.47f, 15.09f, 5.7f)
                lineTo(8.04f, 9.81f)
                curveTo(7.5f, 9.31f, 6.79f, 9f, 6f, 9f)
                curveTo(4.34f, 9f, 3f, 10.34f, 3f, 12f)
                reflectiveCurveTo(4.34f, 15f, 6f, 15f)
                curveTo(6.79f, 15f, 7.5f, 14.69f, 8.04f, 14.19f)
                lineTo(15.16f, 18.34f)
                curveTo(15.11f, 18.55f, 15.08f, 18.77f, 15.08f, 19f)
                curveTo(15.08f, 20.61f, 16.39f, 21.91f, 18f, 21.91f)
                reflectiveCurveTo(20.92f, 20.61f, 20.92f, 19f)
                curveTo(20.92f, 17.39f, 19.61f, 16.08f, 18f, 16.08f)
                moveTo(18f, 4f)
                curveTo(18.55f, 4f, 19f, 4.45f, 19f, 5f)
                reflectiveCurveTo(18.55f, 6f, 18f, 6f)
                reflectiveCurveTo(17f, 5.55f, 17f, 5f)
                reflectiveCurveTo(17.45f, 4f, 18f, 4f)
                moveTo(6f, 13f)
                curveTo(5.45f, 13f, 5f, 12.55f, 5f, 12f)
                reflectiveCurveTo(5.45f, 11f, 6f, 11f)
                reflectiveCurveTo(7f, 11.45f, 7f, 12f)
                reflectiveCurveTo(6.55f, 13f, 6f, 13f)
                moveTo(18f, 20f)
                curveTo(17.45f, 20f, 17f, 19.55f, 17f, 19f)
                reflectiveCurveTo(17.45f, 18f, 18f, 18f)
                reflectiveCurveTo(19f, 18.45f, 19f, 19f)
                reflectiveCurveTo(18.55f, 20f, 18f, 20f)
                close()
            }
        }.build()

        return _ShareVariantOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ShareVariantOutline: ImageVector? = null
