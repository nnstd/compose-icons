package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ContentSaveEditOutline: ImageVector
    get() {
        if (_ContentSaveEditOutline != null) {
            return _ContentSaveEditOutline!!
        }
        _ContentSaveEditOutline = ImageVector.Builder(
            name = "ContentSaveEditOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 19f)
                horizontalLineTo(10f)
                verticalLineTo(21f)
                horizontalLineTo(4f)
                curveTo(2.89f, 21f, 2f, 20.1f, 2f, 19f)
                verticalLineTo(5f)
                curveTo(2f, 3.9f, 2.89f, 3f, 4f, 3f)
                horizontalLineTo(16f)
                lineTo(20f, 7f)
                verticalLineTo(9.12f)
                lineTo(18f, 11.12f)
                verticalLineTo(7.83f)
                lineTo(15.17f, 5f)
                horizontalLineTo(4f)
                verticalLineTo(19f)
                moveTo(14f, 10f)
                verticalLineTo(6f)
                horizontalLineTo(5f)
                verticalLineTo(10f)
                horizontalLineTo(14f)
                moveTo(20.42f, 12.3f)
                curveTo(20.31f, 12.19f, 20.18f, 12.13f, 20.04f, 12.13f)
                curveTo(19.9f, 12.13f, 19.76f, 12.19f, 19.65f, 12.3f)
                lineTo(18.65f, 13.3f)
                lineTo(20.7f, 15.35f)
                lineTo(21.7f, 14.35f)
                curveTo(21.92f, 14.14f, 21.92f, 13.79f, 21.7f, 13.58f)
                lineTo(20.42f, 12.3f)
                moveTo(12f, 19.94f)
                verticalLineTo(22f)
                horizontalLineTo(14.06f)
                lineTo(20.12f, 15.93f)
                lineTo(18.07f, 13.88f)
                lineTo(12f, 19.94f)
                moveTo(14f, 15f)
                curveTo(14f, 13.34f, 12.66f, 12f, 11f, 12f)
                reflectiveCurveTo(8f, 13.34f, 8f, 15f)
                reflectiveCurveTo(9.34f, 18f, 11f, 18f)
                curveTo(11.04f, 18f, 11.08f, 18f, 11.13f, 18f)
                lineTo(14f, 15.13f)
                curveTo(14f, 15.09f, 14f, 15.05f, 14f, 15f)
            }
        }.build()

        return _ContentSaveEditOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ContentSaveEditOutline: ImageVector? = null
