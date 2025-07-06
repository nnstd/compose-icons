package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ChurchOutline: ImageVector
    get() {
        if (_ChurchOutline != null) {
            return _ChurchOutline!!
        }
        _ChurchOutline = ImageVector.Builder(
            name = "ChurchOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 12.22f)
                verticalLineTo(9f)
                lineTo(13f, 6.5f)
                verticalLineTo(5f)
                horizontalLineTo(15f)
                verticalLineTo(3f)
                horizontalLineTo(13f)
                verticalLineTo(1f)
                horizontalLineTo(11f)
                verticalLineTo(3f)
                horizontalLineTo(9f)
                verticalLineTo(5f)
                horizontalLineTo(11f)
                verticalLineTo(6.5f)
                lineTo(6f, 9f)
                verticalLineTo(12.22f)
                lineTo(2f, 14f)
                verticalLineTo(22f)
                horizontalLineTo(11f)
                verticalLineTo(18f)
                curveTo(11f, 17.45f, 11.45f, 17f, 12f, 17f)
                curveTo(12.55f, 17f, 13f, 17.45f, 13f, 18f)
                verticalLineTo(22f)
                horizontalLineTo(22f)
                verticalLineTo(14f)
                lineTo(18f, 12.22f)
                moveTo(20f, 20f)
                horizontalLineTo(15f)
                verticalLineTo(17.96f)
                curveTo(15f, 16.27f, 13.65f, 14.9f, 12f, 14.9f)
                curveTo(10.35f, 14.9f, 9f, 16.27f, 9f, 17.96f)
                verticalLineTo(20f)
                horizontalLineTo(4f)
                verticalLineTo(15.21f)
                lineTo(8f, 13.4f)
                verticalLineTo(10.05f)
                lineTo(12f, 8f)
                lineTo(16f, 10.04f)
                verticalLineTo(13.39f)
                lineTo(20f, 15.2f)
                verticalLineTo(20f)
                moveTo(12f, 10.5f)
                curveTo(12.83f, 10.5f, 13.5f, 11.17f, 13.5f, 12f)
                curveTo(13.5f, 12.83f, 12.83f, 13.5f, 12f, 13.5f)
                curveTo(11.17f, 13.5f, 10.5f, 12.83f, 10.5f, 12f)
                curveTo(10.5f, 11.17f, 11.17f, 10.5f, 12f, 10.5f)
                close()
            }
        }.build()

        return _ChurchOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ChurchOutline: ImageVector? = null
