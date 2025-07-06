package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ContentSaveMinus: ImageVector
    get() {
        if (_ContentSaveMinus != null) {
            return _ContentSaveMinus!!
        }
        _ContentSaveMinus = ImageVector.Builder(
            name = "ContentSaveMinus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 3f)
                horizontalLineTo(5f)
                curveTo(3.89f, 3f, 3f, 3.9f, 3f, 5f)
                verticalLineTo(19f)
                curveTo(3f, 20.11f, 3.9f, 21f, 5f, 21f)
                horizontalLineTo(12.81f)
                curveTo(12.45f, 20.38f, 12.2f, 19.7f, 12.08f, 19f)
                lineTo(12f, 19f)
                curveTo(10.34f, 19f, 9f, 17.66f, 9f, 16f)
                reflectiveCurveTo(10.34f, 13f, 12f, 13f)
                curveTo(12.68f, 13f, 13.34f, 13.23f, 13.87f, 13.65f)
                curveTo(15f, 12.59f, 16.46f, 12f, 18f, 12f)
                curveTo(19.05f, 12f, 20.09f, 12.28f, 21f, 12.81f)
                verticalLineTo(7f)
                lineTo(17f, 3f)
                moveTo(15f, 9f)
                horizontalLineTo(5f)
                verticalLineTo(5f)
                horizontalLineTo(15f)
                verticalLineTo(9f)
                moveTo(14f, 17f)
                verticalLineTo(19f)
                horizontalLineTo(22f)
                verticalLineTo(17f)
                horizontalLineTo(14f)
                close()
            }
        }.build()

        return _ContentSaveMinus!!
    }

@Suppress("ObjectPropertyName")
private var _ContentSaveMinus: ImageVector? = null
