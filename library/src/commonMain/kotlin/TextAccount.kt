package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TextAccount: ImageVector
    get() {
        if (_TextAccount != null) {
            return _TextAccount!!
        }
        _TextAccount = ImageVector.Builder(
            name = "TextAccount",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 5f)
                verticalLineTo(7f)
                horizontalLineTo(3f)
                verticalLineTo(5f)
                horizontalLineTo(21f)
                moveTo(3f, 17f)
                horizontalLineTo(12f)
                verticalLineTo(15f)
                horizontalLineTo(3f)
                verticalLineTo(17f)
                moveTo(3f, 12f)
                horizontalLineTo(21f)
                verticalLineTo(10f)
                horizontalLineTo(3f)
                verticalLineTo(12f)
                moveTo(18f, 14f)
                curveTo(19.11f, 14f, 20f, 14.9f, 20f, 16f)
                reflectiveCurveTo(19.11f, 18f, 18f, 18f)
                reflectiveCurveTo(16f, 17.11f, 16f, 16f)
                reflectiveCurveTo(16.9f, 14f, 18f, 14f)
                moveTo(14f, 22f)
                verticalLineTo(21f)
                curveTo(14f, 19.9f, 15.79f, 19f, 18f, 19f)
                reflectiveCurveTo(22f, 19.9f, 22f, 21f)
                verticalLineTo(22f)
                horizontalLineTo(14f)
                close()
            }
        }.build()

        return _TextAccount!!
    }

@Suppress("ObjectPropertyName")
private var _TextAccount: ImageVector? = null
