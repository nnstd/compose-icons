package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.DatabaseAlert: ImageVector
    get() {
        if (_DatabaseAlert != null) {
            return _DatabaseAlert!!
        }
        _DatabaseAlert = ImageVector.Builder(
            name = "DatabaseAlert",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 7f)
                curveTo(18f, 9.21f, 14.42f, 11f, 10f, 11f)
                reflectiveCurveTo(2f, 9.21f, 2f, 7f)
                reflectiveCurveTo(5.58f, 3f, 10f, 3f)
                reflectiveCurveTo(18f, 4.79f, 18f, 7f)
                moveTo(10f, 18f)
                curveTo(5.58f, 18f, 2f, 16.21f, 2f, 14f)
                verticalLineTo(17f)
                curveTo(2f, 19.21f, 5.58f, 21f, 10f, 21f)
                reflectiveCurveTo(18f, 19.21f, 18f, 17f)
                verticalLineTo(14f)
                curveTo(18f, 16.21f, 14.42f, 18f, 10f, 18f)
                moveTo(10f, 13f)
                curveTo(5.58f, 13f, 2f, 11.21f, 2f, 9f)
                verticalLineTo(12f)
                curveTo(2f, 14.21f, 5.58f, 16f, 10f, 16f)
                reflectiveCurveTo(18f, 14.21f, 18f, 12f)
                verticalLineTo(9f)
                curveTo(18f, 11.21f, 14.42f, 13f, 10f, 13f)
                moveTo(20f, 17f)
                horizontalLineTo(22f)
                verticalLineTo(15f)
                horizontalLineTo(20f)
                verticalLineTo(17f)
                moveTo(20f, 7f)
                verticalLineTo(13f)
                horizontalLineTo(22f)
                verticalLineTo(7f)
                horizontalLineTo(20f)
                close()
            }
        }.build()

        return _DatabaseAlert!!
    }

@Suppress("ObjectPropertyName")
private var _DatabaseAlert: ImageVector? = null
