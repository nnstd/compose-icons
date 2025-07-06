package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.DatabaseMinus: ImageVector
    get() {
        if (_DatabaseMinus != null) {
            return _DatabaseMinus!!
        }
        _DatabaseMinus = ImageVector.Builder(
            name = "DatabaseMinus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 17f)
                verticalLineTo(19f)
                horizontalLineTo(15f)
                verticalLineTo(17f)
                moveTo(12f, 3f)
                curveTo(16.42f, 3f, 20f, 4.79f, 20f, 7f)
                reflectiveCurveTo(16.42f, 11f, 12f, 11f)
                reflectiveCurveTo(4f, 9.21f, 4f, 7f)
                reflectiveCurveTo(7.58f, 3f, 12f, 3f)
                moveTo(4f, 9f)
                curveTo(4f, 11.21f, 7.58f, 13f, 12f, 13f)
                reflectiveCurveTo(20f, 11.21f, 20f, 9f)
                verticalLineTo(12.08f)
                lineTo(19f, 12f)
                curveTo(16.41f, 12f, 14.2f, 13.64f, 13.36f, 15.94f)
                lineTo(12f, 16f)
                curveTo(7.58f, 16f, 4f, 14.21f, 4f, 12f)
                verticalLineTo(9f)
                moveTo(4f, 14f)
                curveTo(4f, 16.21f, 7.58f, 18f, 12f, 18f)
                horizontalLineTo(13f)
                curveTo(13f, 19.05f, 13.27f, 20.04f, 13.75f, 20.9f)
                lineTo(12f, 21f)
                curveTo(7.58f, 21f, 4f, 19.21f, 4f, 17f)
                verticalLineTo(14f)
                close()
            }
        }.build()

        return _DatabaseMinus!!
    }

@Suppress("ObjectPropertyName")
private var _DatabaseMinus: ImageVector? = null
