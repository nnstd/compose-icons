package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.WrenchCheck: ImageVector
    get() {
        if (_WrenchCheck != null) {
            return _WrenchCheck!!
        }
        _WrenchCheck = ImageVector.Builder(
            name = "WrenchCheck",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 2f)
                curveTo(10.8f, 2.6f, 12f, 4.3f, 12f, 6.2f)
                curveTo(12f, 8.2f, 10.8f, 9.9f, 9f, 10.5f)
                verticalLineTo(21.5f)
                curveTo(9f, 21.8f, 8.8f, 22f, 8.5f, 22f)
                horizontalLineTo(6.5f)
                curveTo(6.2f, 22f, 6f, 21.8f, 6f, 21.4f)
                verticalLineTo(10.4f)
                curveTo(4.2f, 9.8f, 3f, 8.1f, 3f, 6.2f)
                reflectiveCurveTo(4.2f, 2.6f, 6f, 2f)
                verticalLineTo(5.7f)
                horizontalLineTo(9f)
                verticalLineTo(2f)
                moveTo(20.6f, 13f)
                lineTo(22f, 14.41f)
                lineTo(15.47f, 21f)
                lineTo(12f, 17.5f)
                lineTo(13.4f, 16.09f)
                lineTo(15.47f, 18.17f)
                lineTo(20.6f, 13f)
            }
        }.build()

        return _WrenchCheck!!
    }

@Suppress("ObjectPropertyName")
private var _WrenchCheck: ImageVector? = null
